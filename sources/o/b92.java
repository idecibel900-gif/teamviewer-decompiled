package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class b92 implements DefaultLifecycleObserver {
    public final /* synthetic */ x84 m;

    public b92(EmojiCompatInitializer emojiCompatInitializer, x84 x84Var) {
        this.m = x84Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        (Build.VERSION.SDK_INT >= 28 ? j11.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new d92(), 500L);
        this.m.f(this);
    }
}
