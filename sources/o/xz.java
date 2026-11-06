package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class xz implements ObjectEncoder {
    public static final xz a = new xz();
    public static final FieldDescriptor b = ua5.g(1, FieldDescriptor.builder("logSource"));
    public static final FieldDescriptor c = ua5.g(2, FieldDescriptor.builder("logEventDropped"));

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) {
        oe4 oe4Var = (oe4) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(b, oe4Var.a);
        objectEncoderContext.add(c, oe4Var.b);
    }
}
