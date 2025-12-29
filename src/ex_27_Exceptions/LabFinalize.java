package ex_27_Exceptions;

public class LabFinalize {
    public static void main(String[] args) {
        LabFinalize lab = new LabFinalize();
        Object labFinalize = null;
        System.gc();
        System.out.println("main methoed done");
    }

    //@Override
    public void finilize () {
        System.out.println("Finalize method called before GC");
    }
}
