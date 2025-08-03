class JavaStaticInitializerBlocker {
    static Scanner scan = new Scanner(System.in);
    static boolean flag = false;
    static int B = scan.nextInt();
    static int H = scan.nextInt();
    static {
        if (B <= 0 || H <= 0) {
            System.out.printf("java.lang.Exception: Breadth and height must be positive");
        } else {
            flag = true;
        }
    }
}