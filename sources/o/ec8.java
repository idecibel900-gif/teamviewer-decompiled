package o;

/* JADX INFO: loaded from: classes.dex */
public interface ec8 {
    boolean a();

    long b(qo qoVar, qo qoVar2, qo qoVar3);

    qo h(long j, qo qoVar, qo qoVar2, qo qoVar3);

    qo u(long j, qo qoVar, qo qoVar2, qo qoVar3);

    default qo w(qo qoVar, qo qoVar2, qo qoVar3) {
        return h(b(qoVar, qoVar2, qoVar3), qoVar, qoVar2, qoVar3);
    }
}
