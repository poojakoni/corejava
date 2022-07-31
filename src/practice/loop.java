package practice;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///for loop
		
for (int i =1; i<=10; i++) {
	
	System.out.println("value of i:"  +i);  // increment of 1 to 10 
	
}
for (int i =10; i>=1; i--) {
	
	System.out.println("value of i:"  + i); // decrement of no 10 to 1
}

// while loop

int i=1;
while (i<=10) {
	
	System.out.println("value of i:"  +i); 
	i++;
}


int j =10;
while (j>=1) {
	
	System.out.println("value of j:"  +j); 
	j--;
}


///do while loop


int a =1;
do {
	System.out.println("value of a:"  +a); 
a++;
}
while (a<=10);


int b=10;
do {
	System.out.println("value of b:"  +b); 
	b--;
	
}
while (b>=1);


//break

int [] numbers= {5,10,15,20,25};

for (int x : numbers) {
if (x == 20) {
	break; //it will break 20 
}
System.out.print(x);
System.out.print("\n");}

int  [] number = {5,10,15,20,25,30,35};

for (int y : number) {
	if (y==30) {
	continue;	// it will skip 30 and continue next number
	}
	System.out.print(y);
	System.out.print("\n");
	
	}

	}

}
