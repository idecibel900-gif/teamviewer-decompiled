package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pl5 {
    public static final fj a;
    public static final yi5 b;
    public static final aw c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            a = null;
            b = new yi5((byte) 4);
            c = new aw((byte) 3);
        } else if (property.equals("Dalvik")) {
            a = new fj((byte) 0);
            b = new v86((byte) 0);
            c = new wf0((byte) 3);
        } else {
            a = null;
            b = new v86((byte) 1);
            c = new wf0((byte) 3);
        }
    }
}
