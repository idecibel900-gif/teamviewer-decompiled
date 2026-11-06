package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface g32 {
    public static final d32 a = new d32();

    List a(String str);

    default dh4 b(f32 f32Var) {
        return new dh4(io7.l, this, f32Var);
    }
}
