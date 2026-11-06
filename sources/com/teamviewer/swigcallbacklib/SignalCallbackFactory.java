package com.teamviewer.swigcallbacklib;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u001f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/teamviewer/swigcallbacklib/SignalCallbackFactory;", "", "<init>", "()V", "Lkotlin/Function0;", "Lo/f88;", "callback", "Lcom/teamviewer/swigcallbacklib/VoidSignalCallback;", "voidSignalCallback", "(Lkotlin/jvm/functions/Function0;)Lcom/teamviewer/swigcallbacklib/VoidSignalCallback;", "Lkotlin/Function1;", "", "Lcom/teamviewer/swigcallbacklib/LongSignalCallback;", "longSignalCallback", "(Lkotlin/jvm/functions/Function1;)Lcom/teamviewer/swigcallbacklib/LongSignalCallback;", "", "Lcom/teamviewer/swigcallbacklib/BoolSignalCallback;", "boolSignalCallback", "(Lkotlin/jvm/functions/Function1;)Lcom/teamviewer/swigcallbacklib/BoolSignalCallback;", "", "Lcom/teamviewer/swigcallbacklib/DoubleSignalCallback;", "doubleSignalCallback", "(Lkotlin/jvm/functions/Function1;)Lcom/teamviewer/swigcallbacklib/DoubleSignalCallback;", "", "Lcom/teamviewer/swigcallbacklib/IntSignalCallback;", "intSignalCallback", "(Lkotlin/jvm/functions/Function1;)Lcom/teamviewer/swigcallbacklib/IntSignalCallback;", "", "Lcom/teamviewer/swigcallbacklib/StringSignalCallback;", "stringSignalCallback", "(Lkotlin/jvm/functions/Function1;)Lcom/teamviewer/swigcallbacklib/StringSignalCallback;", "Lcom/teamviewer/swigcallbacklib/UnsignedIntSignalCallback;", "unsignedIntSignalCallback", "(Lkotlin/jvm/functions/Function1;)Lcom/teamviewer/swigcallbacklib/UnsignedIntSignalCallback;", "Companion", "SwigCallbackLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SignalCallbackFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static SignalCallbackFactory instance = new SignalCallbackFactory();

    private SignalCallbackFactory() {
    }

    public final BoolSignalCallback boolSignalCallback(final Function1 callback) {
        callback.getClass();
        return new BoolSignalCallbackImpl() { // from class: com.teamviewer.swigcallbacklib.SignalCallbackFactory.boolSignalCallback.1
            @Override // com.teamviewer.swigcallbacklib.BoolSignalCallback
            public void OnCallback(boolean value) {
                callback.invoke(Boolean.valueOf(value));
            }
        };
    }

    public final DoubleSignalCallback doubleSignalCallback(final Function1 callback) {
        callback.getClass();
        return new DoubleSignalCallbackImpl() { // from class: com.teamviewer.swigcallbacklib.SignalCallbackFactory.doubleSignalCallback.1
            @Override // com.teamviewer.swigcallbacklib.DoubleSignalCallback
            public void OnCallback(double value) {
                callback.invoke(Double.valueOf(value));
            }
        };
    }

    public final IntSignalCallback intSignalCallback(final Function1 callback) {
        callback.getClass();
        return new IntSignalCallbackImpl() { // from class: com.teamviewer.swigcallbacklib.SignalCallbackFactory.intSignalCallback.1
            @Override // com.teamviewer.swigcallbacklib.IntSignalCallback
            public void OnCallback(int value) {
                callback.invoke(Integer.valueOf(value));
            }
        };
    }

    public final LongSignalCallback longSignalCallback(final Function1 callback) {
        callback.getClass();
        return new LongSignalCallbackImpl() { // from class: com.teamviewer.swigcallbacklib.SignalCallbackFactory.longSignalCallback.1
            @Override // com.teamviewer.swigcallbacklib.LongSignalCallback
            public void OnCallback(long value) {
                callback.invoke(Long.valueOf(value));
            }
        };
    }

    public final StringSignalCallback stringSignalCallback(final Function1 callback) {
        callback.getClass();
        return new StringSignalCallbackImpl() { // from class: com.teamviewer.swigcallbacklib.SignalCallbackFactory.stringSignalCallback.1
            @Override // com.teamviewer.swigcallbacklib.StringSignalCallback
            public void OnCallback(String value) {
                value.getClass();
                callback.invoke(value);
            }
        };
    }

    public final UnsignedIntSignalCallback unsignedIntSignalCallback(final Function1 callback) {
        callback.getClass();
        return new UnsignedIntSignalCallbackImpl() { // from class: com.teamviewer.swigcallbacklib.SignalCallbackFactory.unsignedIntSignalCallback.1
            @Override // com.teamviewer.swigcallbacklib.UnsignedIntSignalCallback
            public void OnCallback(long value) {
                callback.invoke(Long.valueOf(value));
            }
        };
    }

    public final VoidSignalCallback voidSignalCallback(final Function0 callback) {
        callback.getClass();
        return new VoidSignalCallbackImpl() { // from class: com.teamviewer.swigcallbacklib.SignalCallbackFactory.voidSignalCallback.1
            @Override // com.teamviewer.swigcallbacklib.VoidSignalCallback
            public void OnCallback() {
                callback.a();
            }
        };
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/teamviewer/swigcallbacklib/SignalCallbackFactory$Companion;", "", "<init>", "()V", "instance", "Lcom/teamviewer/swigcallbacklib/SignalCallbackFactory;", "getInstance", "()Lcom/teamviewer/swigcallbacklib/SignalCallbackFactory;", "setInstance", "(Lcom/teamviewer/swigcallbacklib/SignalCallbackFactory;)V", "SwigCallbackLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SignalCallbackFactory getInstance() {
            return SignalCallbackFactory.instance;
        }

        public final void setInstance(SignalCallbackFactory signalCallbackFactory) {
            signalCallbackFactory.getClass();
            SignalCallbackFactory.instance = signalCallbackFactory;
        }

        private Companion() {
        }
    }
}
