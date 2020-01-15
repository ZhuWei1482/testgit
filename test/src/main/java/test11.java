import java.io.File;

public class test11 {
    //使用io的File对象
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\git");
        printFile(0,file);
    }

    //请利用File对象列出指定目录下的所有子目录和文件，并按层次打印。
    private static void printFile(int index , File file){
        for(int i=0;i<index;i++){
            System.out.print("   ");
        }
        File[] fs1 = file.listFiles(); // 列出所有文件和子目录
        for(File f : fs1) {
            if(f.isDirectory()){
                System.out.println(f.getName()+"\\");
                printFile(index+1,f);
            }else{
                System.out.println(f.getName());
            }
        }
    }
}
