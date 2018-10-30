package passbyvalueorreference;

public class PassByValueOrReference {
	
	public static void main(String[] args) {
		
		PassByValueOrReference passByValueOrReference = new PassByValueOrReference();
		passByValueOrReference.execute();
		
	}

	private void execute() {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		sb1.append("execute1 tarafýndan eklendi.");
		sb2.append("execute1 tarafýndan eklendi.");
		execute2(sb1,sb2);
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());
		
	}

	private void execute2(StringBuffer sb1, StringBuffer sb2) {
		sb1.append("execute2 tarafýndan eklendi.");
		sb2= new StringBuffer();
		sb2.append("execute2 tarafýndan eklendi.");
	}

}
