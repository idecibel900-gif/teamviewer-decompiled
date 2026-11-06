package o;

import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yd2 extends qf2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd2(EventHub eventHub, EventType eventType, final Function1 function1, Function0 function0) {
        super(function0);
        eventHub.getClass();
        eventType.getClass();
        function1.getClass();
        eventHub.c(eventType, new vd2() { // from class: o.xd2
            @Override // o.vd2
            public final void a(EventType eventType2, he2 he2Var) {
                eventType2.getClass();
                he2Var.getClass();
                if (((Boolean) function1.invoke(he2Var)).booleanValue()) {
                    yd2 yd2Var = this;
                    yd2Var.postValue(yd2Var.a.a());
                }
            }
        });
    }
}
