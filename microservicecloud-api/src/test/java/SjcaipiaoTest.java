import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: yangli
 * Date: 2019-06-11
 * Time: 20:56
 */
public class SjcaipiaoTest {
    public static void main(String[] args){
        for (int times=0;times<5;times++) {
            List<Integer> redBall = new ArrayList();
            List<Integer> blueBall = new ArrayList();
            Random random = new Random();
            for (int i=0;i<7;i++){
                int redInt = random.nextInt(33)+1;
                if(i!=0) {
                    for (int red = 0; red < redBall.size(); red++) {
                        if (redInt == redBall.get(red)) {
                            redBall.remove(red);
                            i--;
                            break;
                        }
                    }
                    redBall.add(redInt);
                }
            }
            //将集合转换为数组
            Integer[] arr = redBall.toArray(new Integer[redBall.size()]);
            for (int num=0;num<arr.length-1;num++) {
                for(int n=num+1;n<arr.length;n++){
                    if(arr[num]>arr[n]){
                        int temp = arr[num];
                        arr[num] = arr[n];
                        arr[n]= temp;
                    }
                }
            }
            redBall.clear();
            for (int i = 0;i<arr.length;i++){
                redBall.add(arr[i]);
            }
            int blueInt = random.nextInt(16)+1;
            blueBall.add(blueInt);
            System.out.println("第"+(times+1)+"注号码--");
            System.out.println("红球号数："+redBall);
            System.out.println("蓝球号数："+blueBall);
        }
    }
}
