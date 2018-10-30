package com.turkcell.performance;

import java.util.Random;

public class Sort {
	//private static boolean yazayammi = true;
	//static int max=100;
	//static int count=10;
	
	static int runCount=50;
	private static boolean yazayammi = false;
	static int max=9990000;
	static int count=9990000;


	public static void main(String[] args) {

		long mainFirst=System.currentTimeMillis();
		for (int k=0;k<runCount;k++)
		{
			long first=System.currentTimeMillis();
			quickSortUsage();
			bubleSortUsage();
			long last=System.currentTimeMillis();
			System.out.println("Süre --> " + (last - first));
		}
		long mainLast=System.currentTimeMillis();
		System.out.println("Toplam Süre --> " + (mainLast - mainFirst));

	}

	private static void quickSortUsage() {
		int i;
		//int array[] = { 12, 9, 4, 99, 1 };
		int array[] = new int[count];
		for (int j=0;j<count;j++)
		{
			Random r = new Random();			
			array[j]=r.nextInt(max);
		}
		
		System.out.println("----------------------QUICK SORT------------------");
		System.out.println("Elements Before Quick Sort:");
		for (i = 0; i < array.length; i++)
		{
			yaz(array[i]);
		}
		quickSort(array, 0, array.length - 1);
		System.out.println("Elements After Quick Sort:");
		for (i = 0; i < array.length; i++)
		{
			yaz(array[i]);			
		}

	}
	
	private static void bubleSortUsage() {
		int i;

		int array[] = new int[count];
		for (int j=0;j<count;j++)
		{
			Random r = new Random();			
			array[j]=r.nextInt(max);
		}
		

		System.out.println("----------------------BUBLE SORT------------------");
		System.out.println("Elements Before Buble Sort:");
		for (i = 0; i < array.length; i++)
		{
			yaz(array[i]);
		}
		quickSort(array, 0, array.length - 1);
		System.out.println("Elements After Buble Sort:");
		for (i = 0; i < array.length; i++)
		{
			yaz(array[i]);
		}
	}

	public static void quickSort(int[] a, int p, int r)
    {
        if(p<r)
        {
            int q=partition(a,p,r);
            quickSort(a,p,q);
            quickSort(a,q+1,r);
        }
    }

    private static int partition(int[] a, int p, int r) {

        int x = a[p];
        int i = p-1 ;
        int j = r+1 ;

        while (true) {
            i++;
            while ( i< r && a[i] < x)
                i++;
            j--;
            while (j>p && a[j] > x)
                j--;

            if (i < j)
                swap(a, i, j);
            else
                return j;
        }
    }

    private static void swap(int[] a, int i, int j) {
        // TODO Auto-generated method stub
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static void bubbleSort(int [] dizi)
    {
        int temp;   // Yer deðiþtirmede kullanýlacak geçici deðiþken
        for (int i=1; i<dizi.length; i++)
        {
            for(int j=0; j<dizi.length-i; j++)
            {
                if (dizi[j] > dizi [j+1])
                {
                    temp = dizi [j];
                    dizi [j] = dizi [j+1];
                    dizi [j+1] = temp;
                }//Önce gelen elaman bir sonrakinden büyükse ikisi yer deðiþtiriyor
            }// Dizinin ardýþýk elamanlarýný karþýlaþtýrmak için kullandýðýmýz döngü
        }// Her karþýlaþtýrmadan sonra yeniden kaldýðýmýz yerden devam etmemizi saðlayan döngü
    }
    
    public static void yaz(int param)
    {
    	if (yazayammi )
    		System.out.print(param + " ");
    }

}
