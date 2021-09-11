package com.company;

public class Main {

    public static void main(String[] args) {
	short numberone = 600;
	short numbertwo = -7;

	if (numberone > numbertwo)
	{
		System.out.println("numberone > numbertwo");
	}
	else if (numberone == numbertwo)
	{
		System.out.println("numberone = numbertwo");
	}
	else
	{
		System.out.println("numberone < numbertwo");
	}

	if (numberone % 2 ==0)
	{
		System.out.println("numberone is even");
	}
	else
	{
		System.out.println("numberone is odd");
	}
	if (numbertwo % 2 ==0)
		{
			System.out.println("numbertwo is even");
		}
	else
		{
			System.out.println("numbertwo is odd");
		}
	if (numberone > 0)
	{System.out.println("numberone is positive");}
	else
	{System.out.println("numberone is negative");}
	if (numbertwo > 0)
		{System.out.println("numbertwo is positive");}
	else
		{System.out.println("numbertwo is negative");}
	if (numberone<100)
	{System.out.println("numberone is less than 100");}
	else
	{System.out.println("numberone is more than 100");}
		if (numbertwo<100)
		{System.out.println("numbertwo is less than 100");}
		else
		{System.out.println("numbertwo is more than 100");}


	}
    }

