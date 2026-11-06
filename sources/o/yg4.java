package o;

/* JADX INFO: loaded from: classes.dex */
public interface yg4 {
    default long a(i04 i04Var, i04 i04Var2) {
        i04 i04VarH = h(i04Var);
        i04 i04VarH2 = h(i04Var2);
        if (i04VarH instanceof ug4) {
            return ((ug4) i04VarH).z(i04VarH2, 0L);
        }
        return i04VarH2 instanceof ug4 ? ((ug4) i04VarH2).z(i04VarH, 0L) ^ (-9223372034707292160L) : i04VarH.z(i04VarH, 0L);
    }

    i04 e(il5 il5Var);

    i04 h(i04 i04Var);
}
