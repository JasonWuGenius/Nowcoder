package BigComp_2018;

/*
    ţţ������

    ��Ŀ����
    ţţ����˯��ͷ�����������˺ܶ����ӣ�ֻ�����������ʱ�����Ż��ѹ������Ҿ������𴲡���������������ҪX���ӵ�����ң��Ͽ�ʱ��Ϊ�����AʱB�֣��������������ʲôʱ����
    ��������:
    ÿ���������һ������������
    ÿ�����������ĵ�һ�а���һ������������ʾ���ӵ�����N(N<=100)��
    ��������N��ÿ�а���������������ʾ������������ʱ��ΪHi(0<=A<24)ʱMi(0<=B<60)�֡�
    ��������һ�а���һ����������ʾ������������ҪX(0<=X<=100)���ӵ�����ҡ�
    ��������һ�а���������������ʾ�Ͽ�ʱ��ΪA(0<=A<24)ʱB(0<=B<60)�֡�
    ���ݱ�֤������һ�����ӿ�����ţţ��ʱ������ҡ�
    �������:
    �������������ʾţţ������ʱ�䡣
    ʾ��1
    ����
    ����
    3 
    5 0 
    6 0 
    7 0 
    59 
    6 59
    ���
    ����
    6 0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class clockNiuNiu{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int hh = 0, mm = 0;
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            hh = Integer.parseInt(bf.readLine());
            mm = Integer.parseInt(bf.readLine());
            a[i] = 60*hh+mm;
        }
        int travelTime = Integer.parseInt(bf.readLine());
        int classTime = 0;
        int HH = Integer.parseInt(bf.readLine());
        int MM = Integer.parseInt(bf.readLine());
        classTime = HH*60+MM;
        int min = 0;
        for(int i=0; i<a.length; i++){
            if(classTime < travelTime+a[i]){
                continue;
            }
            else{
                if(travelTime + a[i] > travelTime + a[min]){
                    min = i;
                }
            }
        }
        System.out.println(a[min]/60+" "+a[min]%60);

    }
}
