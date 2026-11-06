package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import o.ci0;
import o.h28;
import o.h3;
import o.j28;

/* JADX INFO: loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h28 lambda$getComponents$0(ComponentContainer componentContainer) {
        j28.b((Context) componentContainer.get(Context.class));
        return j28.a().c(ci0.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h28 lambda$getComponents$1(ComponentContainer componentContainer) {
        j28.b((Context) componentContainer.get(Context.class));
        return j28.a().c(ci0.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h28 lambda$getComponents$2(ComponentContainer componentContainer) {
        j28.b((Context) componentContainer.get(Context.class));
        return j28.a().c(ci0.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(h28.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) Context.class)).factory(new h3((byte) 7)).build(), Component.builder(Qualified.qualified(LegacyTransportBackend.class, h28.class)).add(Dependency.required((Class<?>) Context.class)).factory(new h3((byte) 8)).build(), Component.builder(Qualified.qualified(TransportBackend.class, h28.class)).add(Dependency.required((Class<?>) Context.class)).factory(new h3((byte) 9)).build(), LibraryVersionComponent.create(LIBRARY_NAME, "18.2.0"));
    }
}
