package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class a00 implements ObjectEncoder {
    public static final a00 a = new a00();
    public static final FieldDescriptor b = ua5.g(1, FieldDescriptor.builder("startMs"));
    public static final FieldDescriptor c = ua5.g(2, FieldDescriptor.builder("endMs"));

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) {
        mv7 mv7Var = (mv7) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(b, mv7Var.a);
        objectEncoderContext.add(c, mv7Var.b);
    }
}
