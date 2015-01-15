package com.david.utask;

import java.util.Scanner;

public class TaskManager
{
	Scanner scanner = new Scanner(System.in);
	
	Task[] task;
	
	public int input;

	public void execute()
	{
		this.inputUser();
	}
	
	private void inputUser()
	{
		
		do
		{
			System.out.println("Insert your desired action: ");
			System.out.println("1. Show tasks");
			System.out.println("2. Sort tasks");
			System.out.println("3. Delete tasks");
			System.out.println("4. Exit");

			input = scanner.nextInt();

			if(input == 1)
			{
				this.showTask(task);
			}
			else if(input == 2)
			{
				this.sortTask(task);
			}
			else if(input == 3)
			{
				this.deleteTask(task);
			}
			else
			{
				System.out.println("Insert a correct number");
			}
		}
		while(input == 4);
	}
	
	private void showTask(Task[] task)
	{
		if(task.length != 0)
		{
			System.out.println("+--------------+--------------+--------------+----------+-------------------------------------------------+");
			System.out.println("|     Name     |     Time     |     Tag      | Priority |  Description                                    |");
			System.out.println("+--------------+--------------+--------------+----------+-------------------------------------------------+");
		
			for(int i = 0; i < task.length; i++)
			{
				System.out.println(task[i]);
			}
		}
		else
		{
			System.out.println("There aren't tasks");
		}
	}
	
	private Task[] sortTask(Task[] task)
	{
		return task;
	}
	
	private Task[] deleteTask(Task[] task)
	{
		return task;
		
	}
}
