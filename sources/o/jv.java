package o;

/* JADX INFO: loaded from: classes.dex */
public interface jv {
    void c(int i, Object obj);

    void d(Object obj);

    void e();

    void f(int i, int i2, int i3);

    void g(int i, int i2);

    void i();

    void j(int i, Object obj);

    default void l() {
    }

    Object m();

    default void o(Object obj, hw2 hw2Var) {
        hw2Var.invoke(m(), obj);
    }
}
