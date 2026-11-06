package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cg0 extends bx2 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cg0(byte b, int i, Object obj) {
        super(i, obj);
        this.n = b;
    }

    @Override // o.bj0, o.rt3
    public final String getName() {
        switch (this.n) {
            case 0:
                return "loadResource";
            case 1:
                return "simpleType";
            case 2:
                return "getValueClassPropertyType";
            case 3:
                return "<init>";
            case 4:
                return "prepareType";
            case 5:
                return "searchMethodsByNameWithoutBuiltinMagic";
            default:
                return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }
    }

    @Override // o.bj0
    public final ku3 getOwner() {
        switch (this.n) {
            case 0:
                return w86.a.b(gg0.class);
            case 1:
                return w86.a.b(hm3.class);
            case 2:
                return w86.a.b(pp1.class);
            case 3:
                return w86.a.b(np1.class);
            case 4:
                return w86.a.b(tz3.class);
            case 5:
                return w86.a.b(g24.class);
            default:
                return w86.a.b(g24.class);
        }
    }

    @Override // o.bj0
    public final String getSignature() {
        switch (this.n) {
            case 0:
                return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
            case 1:
                return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
            case 2:
                return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
            case 3:
                return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
            case 4:
                return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
            case 5:
                return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            default:
                return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.n) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((gg0) this.receiver).getClass();
                return gg0.a(str);
            case 1:
                aw5 aw5Var = (aw5) obj;
                aw5Var.getClass();
                return ((q48) this.receiver).d(aw5Var, true);
            case 2:
                sy4 sy4Var = (sy4) obj;
                sy4Var.getClass();
                return ((pp1) this.receiver).D0(sy4Var);
            case 3:
                uz3 uz3Var = (uz3) obj;
                uz3Var.getClass();
                return new np1((pp1) this.receiver, uz3Var);
            case 4:
                sz3 sz3Var = (sz3) obj;
                sz3Var.getClass();
                return ((tz3) this.receiver).a(sz3Var);
            case 5:
                sy4 sy4Var2 = (sy4) obj;
                sy4Var2.getClass();
                return ((g24) this.receiver).N(sy4Var2);
            default:
                sy4 sy4Var3 = (sy4) obj;
                sy4Var3.getClass();
                return ((g24) this.receiver).O(sy4Var3);
        }
    }
}
