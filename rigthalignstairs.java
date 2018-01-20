package staircase;

public class rigthalignstairs {
	
	public static void printstairs( int n){
		for (int i = 1;i<=n;i++){
			int hash = i;
			int space = n-i;
			
			while(space>0){System.out.print(" "); space--;}
			for(int j=1; j<=hash;j++){System.out.print("#");}
			System.out.println();
		}
			}
	
	public static void main(String args[]){
		printstairs(7);
		
	}
}

/*
/first diagonal
int fd = 0;
for (int i=0; i < n; i++) {
	fd += a[i][i];
}

//second diagonal
int sd = 0;
int x = 0;
int y = n-1;
for (int j=0; j < n; j++) {
	sd += a[x++][y--];
}        

int answer = Math.abs(sd-fd);
System.out.println(answer);  
 */
