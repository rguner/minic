package com.guner.sonar.denemeler;

public class KodTekrar1 {
	
	public void execute1()
	{
		for (int i=0;i<Integer.MAX_VALUE;i++)
		{
			switch(i)
			{
				case 0: 
					System.out.println(i);
					break;
				case 1: 
					System.out.println(i);
					break;
				case 2: 
					System.out.println(i);
					break;
				default:
					System.out.println(i);
					break;					
			}		
		}
		
	}
	
//	public void execute1() --> dublike olarak bulunuyor. 17 satır
//	{
//		for (int i=0;i<Integer.MAX_VALUE;i++)
//		{
//			switch(i)
//			{
//				case 0: 
//					System.out.println(i);
//					break;
//				case 1: 
//					System.out.println(i);
//					break;
//				case 2: 
//					System.out.println(i);
//					break;
//				default:
//					break;					
//			}		
//		}
//		
//	}
	
//	dublike olarak bulunmuyor..
//	for (int i=0;i<Integer.MAX_VALUE;i++)
//	{
//		switch(i)
//		{
//			case 0: 
//				System.out.println(i);
//				break;
//			case 1: 
//				System.out.println(i);
//				break;
//			case 2: 
//				System.out.println(i);
//				break;
//			default:
//				break;					
//		}		
//	}
	
//	dublike olarak bulunuyor 16 satır
//	for (int i=0;i<Integer.MAX_VALUE;i++)
//	{
//		switch(i)
//		{
//			case 0: 
//				System.out.println(i);
//				break;
//			case 1: 
//				System.out.println(i);
//				break;
//			case 2: 
//				System.out.println(i);
//				break;
//			default:
//				System.out.println(i);
//				break;					
//		}		
//	}
	
	
	
	public void execute2()
	{
		for (int i=0;i<Integer.MAX_VALUE;i++)
		{
			switch(i)
			{
				case 0: 
					System.out.println(i);
					break;
				case 1: 
					System.out.println(i);
					break;
				case 2: 
					System.out.println(i);
					break;
				default:
					System.out.println(i);
					break;					
			}		
		}
		
	}
	
	public void execute3()
	{
		for (int i=0;i<Integer.MAX_VALUE;i++)
		{
			switch(i)
			{
				case 0: 
					System.out.println(i);
					break;
				case 1: 
					System.out.println(i);
					break;
				case 2: 
					System.out.println(i);
					break;
				default:
					System.out.println(i);
					break;					
			}		
		}
	}

}
