package o;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.encoders.proto.ProtobufEncoder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eq3 implements ObjectEncoder {
    public final /* synthetic */ byte a;

    public /* synthetic */ eq3(byte b) {
        this.a = b;
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) {
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        switch (this.a) {
            case 0:
                JsonDataEncoderBuilder.lambda$static$0(obj, objectEncoderContext);
                break;
            default:
                ProtobufEncoder.Builder.lambda$static$0(obj, objectEncoderContext);
                break;
        }
    }
}
