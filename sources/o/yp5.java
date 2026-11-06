package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yp5 {
    public static final uo3 a = new uo3(b65.n, false);
    public static final uo3 b;
    public static final uo3 c;
    public static final LinkedHashMap d;

    static {
        b65 b65Var = b65.f402o;
        b = new uo3(b65Var, false);
        c = new uo3(b65Var, true);
        og1 og1Var = new og1((byte) 5);
        byte b2 = 23;
        new a65(og1Var, "java/util/Iterator", b2).B0("forEachRemaining", null, new o48((byte) 22));
        new a65(og1Var, "java/lang/Iterable", b2).B0("spliterator", null, new xp5((byte) 3));
        a65 a65Var = new a65(og1Var, "java/util/Collection", b2);
        a65Var.B0("removeIf", null, new xp5((byte) 14));
        a65Var.B0("stream", null, new xp5((byte) 21));
        a65Var.B0("parallelStream", null, new xp5((byte) 22));
        a65 a65Var2 = new a65(og1Var, "java/util/List", b2);
        a65Var2.B0("replaceAll", null, new xp5((byte) 23));
        a65Var2.B0("addFirst", "2.1", new xp5((byte) 24));
        a65Var2.B0("addLast", "2.1", new xp5((byte) 25));
        a65Var2.B0("removeFirst", "2.1", new xp5((byte) 26));
        a65Var2.B0("removeLast", "2.1", new xp5((byte) 27));
        a65 a65Var3 = new a65(og1Var, "java/util/LinkedList", b2);
        a65Var3.B0("addFirst", "2.1", new o48((byte) 23));
        a65Var3.B0("addLast", "2.1", new o48((byte) 24));
        a65Var3.B0("removeFirst", "2.1", new o48((byte) 25));
        a65Var3.B0("removeLast", "2.1", new o48((byte) 26));
        a65 a65Var4 = new a65(og1Var, "java/util/Map", b2);
        a65Var4.B0("forEach", null, new o48((byte) 27));
        a65Var4.B0("putIfAbsent", null, new o48((byte) 28));
        a65Var4.B0("replace", null, new o48((byte) 29));
        a65Var4.B0("replace", null, new xp5((byte) 0));
        a65Var4.B0("replaceAll", null, new xp5((byte) 1));
        a65Var4.B0("compute", null, new xp5((byte) 2));
        a65Var4.B0("computeIfAbsent", null, new xp5((byte) 4));
        a65Var4.B0("computeIfPresent", null, new xp5((byte) 5));
        a65Var4.B0("merge", null, new xp5((byte) 6));
        a65 a65Var5 = new a65(og1Var, "java/util/Optional", b2);
        a65Var5.B0("empty", null, new xp5((byte) 7));
        a65Var5.B0("of", null, new xp5((byte) 8));
        a65Var5.B0("ofNullable", null, new xp5((byte) 9));
        a65Var5.B0("get", null, new xp5((byte) 10));
        a65Var5.B0("ifPresent", null, new xp5((byte) 11));
        new a65(og1Var, "java/lang/ref/Reference", b2).B0("get", null, new xp5((byte) 12));
        new a65(og1Var, "java/util/function/Predicate", b2).B0("test", null, new xp5((byte) 13));
        new a65(og1Var, "java/util/function/BiPredicate", b2).B0("test", null, new xp5((byte) 15));
        new a65(og1Var, "java/util/function/Consumer", b2).B0("accept", null, new xp5((byte) 16));
        new a65(og1Var, "java/util/function/BiConsumer", b2).B0("accept", null, new xp5((byte) 17));
        new a65(og1Var, "java/util/function/Function", b2).B0("apply", null, new xp5((byte) 18));
        new a65(og1Var, "java/util/function/BiFunction", b2).B0("apply", null, new xp5((byte) 19));
        new a65(og1Var, "java/util/function/Supplier", b2).B0("get", null, new xp5((byte) 20));
        d = og1Var.a;
    }
}
