package o;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bj0 implements rt3, Serializable {
    public static final Object NO_RECEIVER = aj0.m;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient rt3 reflected;
    private final String signature;

    public bj0(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // o.rt3
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // o.rt3
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public rt3 compute() {
        rt3 rt3Var = this.reflected;
        if (rt3Var != null) {
            return rt3Var;
        }
        rt3 rt3VarComputeReflected = computeReflected();
        this.reflected = rt3VarComputeReflected;
        return rt3VarComputeReflected;
    }

    public abstract rt3 computeReflected();

    @Override // o.qt3
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // o.rt3
    public String getName() {
        return this.name;
    }

    public ku3 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? w86.a.c(cls, "") : w86.a.b(cls);
    }

    @Override // o.rt3
    public List<pv3> getParameters() {
        return getReflected().getParameters();
    }

    public rt3 getReflected() {
        rt3 rt3VarCompute = compute();
        if (rt3VarCompute != this) {
            return (pu3) rt3VarCompute;
        }
        throw new lz3();
    }

    @Override // o.rt3
    public ow3 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }
}
