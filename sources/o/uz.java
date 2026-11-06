package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class uz implements ObjectEncoder {
    public static final uz a = new uz();
    public static final FieldDescriptor b = ua5.g(1, FieldDescriptor.builder("window"));
    public static final FieldDescriptor c = ua5.g(2, FieldDescriptor.builder("logSourceMetrics"));
    public static final FieldDescriptor d = ua5.g(3, FieldDescriptor.builder("globalMetrics"));
    public static final FieldDescriptor e = ua5.g(4, FieldDescriptor.builder("appNamespace"));

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) {
        ot0 ot0Var = (ot0) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(b, ot0Var.a);
        objectEncoderContext.add(c, ot0Var.b);
        objectEncoderContext.add(d, ot0Var.c);
        objectEncoderContext.add(e, ot0Var.d);
    }
}
