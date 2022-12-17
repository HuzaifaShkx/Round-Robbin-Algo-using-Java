package round_robin;

import java.util.Scanner;

public class main {
	
	//ROUND ROBBIN
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int p;
		int tq;
		int temp=0,sq=0;
		System.out.println("Please enter the number of processes");
		p=s.nextInt();
		System.out.println("Please enter Time Quantum for processes");
		tq=s.nextInt();
		int cpu[]=new int[p];
		int art[]=new int[p];
		int wt[]=new int[p];
		int tat[]=new int[p];
		int rt[]=new int[p];
		
		
		for(int i=0;i<p;i++) {
			System.out.println("Please enter CPU burst time for process");
			cpu[i]=s.nextInt();
			System.out.println("Please enter Arival Time for process in sequence");
			art[i]=s.nextInt();
		}
		int sum=0;
		
		while(true) {
		int count=0;
		for(int i=0;i<p;i++) {
			 temp=tq;
			if(cpu[i]==0) {
				count++;
				continue;
			}
			
			if(cpu[i]>tq) {
				cpu[i]=cpu[i]-tq;
			
			}
			else if(cpu[i]>=tq) {
			temp=cpu[i];
			cpu[i]=0;
			sq=sq+temp;
			tat[i]=sq;	
			}	
		}
		 if(p==count)
			break;
		
		}
		
		for(int i=0;i<p;i++) {
			wt[i]=tat[i]-cpu[i];
			
			System.out.println("Waiting time for process "+i+" is :"+wt[i]);
			System.out.println("turn around time for process "+i+" is :"+tat[i]);
			System.out.println("response time for process "+i+" is :"+rt[i]);
			
			
			}
		}
		
	}





