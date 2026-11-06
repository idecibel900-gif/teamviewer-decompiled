package o;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes2.dex */
public final class eo8 extends rc6 implements hw2 {
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f731o;
    public boolean p;
    public /* synthetic */ Object q;
    public final /* synthetic */ p82 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo8(p82 p82Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.r = p82Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        eo8 eo8Var = new eo8(this.r, hc1Var);
        eo8Var.q = obj;
        return eo8Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((eo8) create((aq6) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        int length;
        int i;
        Object nx3Var;
        Node node = (Node) this.r.n;
        aq6 aq6Var = (aq6) this.q;
        boolean z = this.p;
        if (!z) {
            ct1.a0(obj);
            length = node.getChildNodes().getLength();
            i = 0;
        } else {
            if (!z) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            length = this.f731o;
            int i2 = this.n;
            ct1.a0(obj);
            i = i2 + 1;
        }
        if (i >= length) {
            return f88.a;
        }
        node.getChildNodes().getLength();
        Node nodeItem = node.getChildNodes().item(i);
        if (nodeItem instanceof Element) {
            nx3Var = new p82((Element) nodeItem);
        } else {
            nodeItem.getClass();
            nx3Var = new nx3((Object) nodeItem, (byte) 27);
        }
        this.q = aq6Var;
        this.n = i;
        this.f731o = length;
        this.p = true;
        aq6Var.b(nx3Var, this);
        return ne1.m;
    }
}
