package o;

import com.teamviewer.chatviewmodel.swig.EndpointUIState;
import com.teamviewer.chatviewmodel.swig.IConversationUIModel;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a16 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[EndpointUIState.values().length];
        try {
            iArr[EndpointUIState.Online.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EndpointUIState.OnlineAway.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EndpointUIState.OnlineBusy.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EndpointUIState.Offline.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EndpointUIState.Unknown.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[IConversationUIModel.ConversationType.values().length];
        try {
            iArr2[IConversationUIModel.ConversationType.ComputerConversation.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[IConversationUIModel.ConversationType.GroupConversation.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[IConversationUIModel.ConversationType.EmptyConversation.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[IConversationUIModel.ConversationType.GroupConversationWithShardHistory.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[IConversationUIModel.ConversationType.ServiceCaseConversation.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[IConversationUIModel.ConversationType.ContactConversation.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[IConversationUIModel.ConversationType.Unknown.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        b = iArr2;
    }
}
