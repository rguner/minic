package net.javabeat.articles.javaagent.statistics;

import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.ProtectionDomain;
import java.util.List;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

public class StatisticsClassTransformer implements ClassFileTransformer{
	
	public byte[] transform(ClassLoader    loader,
            String              className,
            Class<?>            classBeingRedefined,
            ProtectionDomain    protectionDomain,
            byte[]              classfileBuffer)
			throws IllegalClassFormatException {
		
		System.out.println();
		System.out.println("Processing class " + className);		
		
		String normalizedClassName = className.replaceAll("/", ".");
		
		ClassReader classReader = null;
		try {
			classReader = new ClassReader(normalizedClassName);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		ClassNode classNode = new ClassNode();
		classReader.accept(classNode, ClassReader.SKIP_DEBUG);
		
		@SuppressWarnings("unchecked")
		List<MethodNode> allMethods = classNode.methods;
		for (MethodNode methodNode : allMethods){
			System.out.println(methodNode.name);
		}
		return classfileBuffer;
	}

	private static void processBizMethods(Class<?> classObject) {
		
		if (MyBusinessClass.class.equals(classObject)){

			Method[] allMethods = classObject.getDeclaredMethods();
			for (Method aMethod : allMethods){

				System.out.println(aMethod.getName());
				int modifiers = aMethod.getModifiers();
				if (Modifier.isPrivate(modifiers)){
					System.out.println("Method " + aMethod.getName() + " is private");
				}
			}			
		}		
	}
	
	public static void main(String[] args) {
		processBizMethods(MyBusinessClass.class);
	}
}
