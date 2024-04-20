public class BinOps {
    public String sum(String a, String b) {
        int aa = Integer.parseInt(a, 2);
        int bb = Integer.parseInt(b, 2);
        String result = Integer.toBinaryString(aa + bb);
        return result;
    }

    public String mult(String a, String b) {
        int aa = Integer.parseInt(a, 2);
        int bb = Integer.parseInt(b, 2);
        String result = Integer.toBinaryString(aa * bb);
        return result;
    }
}