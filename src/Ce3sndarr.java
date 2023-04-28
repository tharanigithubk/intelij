import java.util.ArrayList;

public class Ce3sndarr {
    public static void main(String[] args){
        ArrayList<Integer>common=new ArrayList<Integer>();
        int arr1[]={1,2,3};
        int arr2[]={0,1,2,3,4};
        int arr3[]={2,4,6,8};
        int x=0,y=0,z=0;
        while (x<arr1.length&&y<arr2.length&&z<arr3.length) {
            if (arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
                common.add(arr1[x]);
                x++;
                y++;
                z++;
            } else if (arr1[x] < arr2[y])
                x++;
            else if (arr2[y] < arr3[z])
                y++;
            else
                z++;
        }
        System.out.println("common element from three sorted(in non decreasing order)arrays:");
        System.out.println(common);
            }
        }


