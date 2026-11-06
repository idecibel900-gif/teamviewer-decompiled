package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class mz implements ObjectEncoder {
    public static final mz a = new mz();
    public static final FieldDescriptor b = FieldDescriptor.of("requestTimeMs");
    public static final FieldDescriptor c = FieldDescriptor.of("requestUptimeMs");
    public static final FieldDescriptor d = FieldDescriptor.of("clientInfo");
    public static final FieldDescriptor e = FieldDescriptor.of("logSource");
    public static final FieldDescriptor f = FieldDescriptor.of("logSourceName");
    public static final FieldDescriptor g = FieldDescriptor.of("logEvent");
    public static final FieldDescriptor h = FieldDescriptor.of("qosTier");

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) {
        ne4 ne4Var = (ne4) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(b, ((n00) ne4Var).a);
        n00 n00Var = (n00) ne4Var;
        objectEncoderContext.add(c, n00Var.b);
        objectEncoderContext.add(d, n00Var.c);
        objectEncoderContext.add(e, n00Var.d);
        objectEncoderContext.add(f, n00Var.e);
        objectEncoderContext.add(g, n00Var.f);
        objectEncoderContext.add(h, vx5.m);
    }
}
