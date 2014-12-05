//Fernando Bolanos
//hw11 - Matrix Sorter
//12/05/2014
//Matrix Sorter HW Assignment


import java.util.Arrays;
public class MatrixSorter {
	  public static void main(String arg[]){
		    int[][][] mat3d;
		    mat3d=buildMat3d();
		    show(mat3d);
		    System.out.println("The smallest entry in the 3D matrix is "+
		  			findMin(mat3d));
		    System.out.println("After sorting the 3rd matrix we get");
		    sort(mat3d);
		    show(mat3d);
		   }
	  
	  public static int[][][] buildMat3d(){//build the array
		  int [][][] y=new int [3][][];
		  for(int i=0; i<3; i++){//allocate the array
			  y[i]=new int [3+2*i][];
		  }
		  for(int s=0; s<3; s++){//allocate the array
			  for(int j=0; j<y[s].length; j++){
				  y[s][j]=new int [s+j+1];
		  	}
		  }
	  
		  for (int n=0; n<3; n++){//add values to the array
				for (int m=0; m<y[n].length; m++){
					for(int l=0; l<y[n][m].length; l++){
						y[n][m][l]=(int) (Math.random()*99+1);
					}
				}
		  }
		  return y;//return the array
	  }
	  
	  public static void show(int y[][][]){//print the array
		  int x=1;
		  for (int n=0; n<3; n++){
				System.out.println("---------------------------Slab "+x);
				x++;
				for (int m=0; m<y[n].length; m++){//print the array
					for(int l=0; l<y[n][m].length; l++){
						System.out.print(y[n][m][l]+" ");
					}
					System.out.println();
				}
		  }
		  System.out.println("---------------------------");
	  }
	  
	  public static int findMin(int y[][][]){//find the min
			int min=y[1][1][1];
			for(int i=0; i<3; i++){//for loop to find the min
				for(int j=0; j<y[i].length; j++){
					for(int k=0; k<y[i][j].length; k++){
						if(y[i][j][k]<min){
							min=y[i][j][k];
						}
					}
				}
			}
			return min;
	  }
	  
	  public static int [][][] sort(int[][][] y){//sort only the 3rd slab
		  for(int i=2; i<3; i++){//for loop to sort.
			  for(int j=0; j<y[i].length; j++){
					Arrays.sort(y[i][j]);
			  }
		  }
		  return y;
		  
	  }
	   
}