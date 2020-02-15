package com.scnu.zwebapp;

import java.util.Random;

import org.junit.Test;

public class MyTest {
	
	@Test
	public void quickSortTest() {
		int[] arr = new int[] {2, 12, 16, 88, 5, 10, 32, 24};
		quickSort(arr, 0, arr.length - 1);
        for(int a : arr) {
        	System.out.print(a);
        	System.out.print(" ");
        }
        System.out.println();

	}
	
	
	public static final void call() {
		
	}
	
	public void quickSort(int[] arr, int left, int right) {
        
        //数组最左边小于最右边不合法,直接退出
        if (left > right) {
            return;
        }
         
        //定义变量i指向最左边
        int i = left;
         
        //定义变量j指向最右边
        int j = right;
         
        //定义左边为基准元素base
        int range = right - left;
        int nextInt = range != 0 ? (new Random().nextInt(range)) + left : left;
        int base = arr[nextInt];
        System.out.println(base);
 
        //只要i和j没有指向同一个元素,就继续交换
        while (i != j) {
 
            //从右向左寻找第一个小于基准元素的数
            while (arr[j] >= base && i < j) {
                j--;
            }
 
            //从左向右寻找第一个大于基准元素的数
            while (arr[i] <= base && i < j) {
                i++;
            }
 
            //执行到这里证明找到了i和j指向的元素
            //交换i和j指向的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
 
        //将i和j共同指向的元素与基准元素交换
        if(j < nextInt) {
        	j++;
        } else if (j < nextInt) {
        	j--;
        }
        arr[nextInt] = arr[j];
        arr[j] = base;
        for(int a : arr) {
        	System.out.print(a);
        	System.out.print(" ");
        }
        System.out.println();
 
        //对左边进行快速排序
        quickSort(arr, left, i - 1);
         
        //对右边进行快速排序
        quickSort(arr, i + 1, right);
    }

}
