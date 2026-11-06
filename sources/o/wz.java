package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class wz implements ObjectEncoder {
    public static final wz a = new wz();
    public static final FieldDescriptor b = ua5.g(1, FieldDescriptor.builder("eventsDroppedCount"));
    public static final FieldDescriptor c = ua5.g(3, FieldDescriptor.builder("reason"));

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) {
        le4 le4Var = (le4) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(b, le4Var.a);
        objectEncoderContext.add(c, le4Var.b);
    }
}
