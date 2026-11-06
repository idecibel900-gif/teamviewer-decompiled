package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class kz implements ObjectEncoder {
    public static final kz a = new kz();
    public static final FieldDescriptor b = FieldDescriptor.of("clientType");
    public static final FieldDescriptor c = FieldDescriptor.of("androidClientInfo");

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) {
        nt0 nt0Var = (nt0) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        ((g00) nt0Var).getClass();
        objectEncoderContext.add(b, mt0.m);
        objectEncoderContext.add(c, ((g00) nt0Var).a);
    }
}
