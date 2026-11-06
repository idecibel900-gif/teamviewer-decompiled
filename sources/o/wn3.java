package o;

import android.content.Context;
import com.google.firebase.datastorage.JavaDataStorage;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wn3 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ JavaDataStorage n;

    public /* synthetic */ wn3(JavaDataStorage javaDataStorage, byte b) {
        this.m = b;
        this.n = javaDataStorage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        JavaDataStorage javaDataStorage = this.n;
        switch (b) {
            case 0:
                return JavaDataStorage.dataStore_delegate$lambda$0(javaDataStorage, (te1) obj);
            default:
                return JavaDataStorage.dataStore_delegate$lambda$1(javaDataStorage, (Context) obj);
        }
    }
}
