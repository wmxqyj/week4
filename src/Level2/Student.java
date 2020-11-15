package Level2;

// 1.添加学生信息\n 2.显示学生信息\n 3.删除学生信息\n 4.修改学生信息\n5.查看学生信息\n 6.排序\n7.退出


public class Student {

    public static void main(String[] args) {
        Configuration con = new Configuration();
        System.out.println("欢迎进入学生管理系统\n1.添加学生信息\n2.显示学生信息\n" +
                "3.删除学生信息\n4.修改学生信息\n5.查询学生信息\n6.排序\n7.退出");
        con.Config();
    }
}

