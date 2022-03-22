package list;

import java.util.Scanner;

public class Xyz {

	public static void main(String[] args) {
		    Scanner sc =new Scanner(System.in);
		    int count=0;
		    System.out.println("enter number of rows and columns : ");
		    int n=sc.nextInt();
		        int m=sc.nextInt();
		        int a[][]=new int[n][m];
		        for(int i=0;i<n;i++){
		            for(int j=0;j<m;j++)
		            {
		                a[i][j]=sc.nextInt();
		            }
		        }
		        for(int i=0;i<a.length-1;i++){
		            for(int j=i;j<a[i].length;j++)
		            {
		                if(a[i][j]==0){
		                    for(int k=0;k<a.length;k++){
		                        a[i][k]=9;
		                        a[k][i]=9;
		                    }
		                }
		                
		            }
		        }
		        System.out.println("the result is :");
		        for(int i=0;i<a.length;i++){
		            for(int j=0;j<a[i].length;j++)
		            {
		                System.out.print(a[i][j]+" ");
		            }System.out.println();
		        }
		    }
		    
		}
