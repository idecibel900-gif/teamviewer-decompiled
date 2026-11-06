package com.teamviewer.apidefinitions.chat.apis;

import com.teamviewer.apidefinitions.chat.models.ChatAddUsers;
import com.teamviewer.apidefinitions.chat.models.ChatConversation;
import com.teamviewer.apidefinitions.chat.models.ChatConversationsResponse;
import com.teamviewer.apidefinitions.chat.models.ChatCreateConversation;
import com.teamviewer.apidefinitions.chat.models.ChatGetMessagesResponse;
import com.teamviewer.apidefinitions.chat.models.ChatMessage;
import com.teamviewer.apidefinitions.chat.models.ChatModifyUserResponse;
import com.teamviewer.apidefinitions.chat.models.ChatRenameConversation;
import com.teamviewer.apidefinitions.chat.models.ChatRenameConversationResponse;
import com.teamviewer.apidefinitions.chat.models.ChatSendMessage;
import com.teamviewer.apidefinitions.chat.models.ChatStatus;
import com.teamviewer.apidefinitions.chat.models.ChatUser;
import com.teamviewer.apidefinitions.chat.models.ReadMessageRequest;
import com.teamviewer.apidefinitions.chat.models.UserTypingRequest;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import o.f88;
import o.j80;
import o.jg1;
import o.ox2;
import o.qc5;
import o.qi0;
import o.sy5;
import o.xg5;
import o.yc5;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H'¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\u0014J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001a\u0010\u0014J-\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00062\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0016H'¢\u0006\u0004\b\u001d\u0010\u0019JC\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0016H'¢\u0006\u0004\b#\u0010$J+\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0%0\u00062\u000e\b\u0001\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160%H'¢\u0006\u0004\b(\u0010)J'\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0%0\u00062\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u0016H'¢\u0006\u0004\b+\u0010,J)\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020-H'¢\u0006\u0004\b/\u00100J/\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160%H'¢\u0006\u0004\b1\u00102J)\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00104\u001a\u000203H'¢\u0006\u0004\b6\u00107J+\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u00109\u001a\u0004\u0018\u000108H'¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b=\u0010\u0014J)\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b>\u0010\u0019J)\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010@\u001a\u00020?H'¢\u0006\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/apis/ChatApi;", "", "Ljava/util/UUID;", "conversationId", "Lcom/teamviewer/apidefinitions/chat/models/ChatAddUsers;", "chatAddUsers", "Lo/qi0;", "Lcom/teamviewer/apidefinitions/chat/models/ChatModifyUserResponse;", "addUsers", "(Ljava/util/UUID;Lcom/teamviewer/apidefinitions/chat/models/ChatAddUsers;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/chat/models/ChatStatus;", "chatStatus", "()Lo/qi0;", "Lcom/teamviewer/apidefinitions/chat/models/ChatCreateConversation;", "chatCreateConversation", "Lcom/teamviewer/apidefinitions/chat/models/ChatConversation;", "createConversation", "(Lcom/teamviewer/apidefinitions/chat/models/ChatCreateConversation;)Lo/qi0;", "Lo/f88;", "deleteConversation", "(Ljava/util/UUID;)Lo/qi0;", "deleteMessages", "", "messageId", "fileDownload", "(Ljava/util/UUID;Ljava/lang/String;)Lo/qi0;", "getConversation", "lastActivityBefore", "Lcom/teamviewer/apidefinitions/chat/models/ChatConversationsResponse;", "getConversations", "", "limit", "lastMessageId", "lastMessageTime", "Lcom/teamviewer/apidefinitions/chat/models/ChatGetMessagesResponse;", "getMessages", "(Ljava/util/UUID;Ljava/lang/Integer;Ljava/util/UUID;Ljava/lang/String;)Lo/qi0;", "", "requestBody", "Lcom/teamviewer/apidefinitions/chat/models/ChatUser;", "getUsersById", "(Ljava/util/List;)Lo/qi0;", "searchParam", "getUsersBySearchParam", "(Ljava/lang/String;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/chat/models/ReadMessageRequest;", "readMessageRequest", "readMessage", "(Ljava/util/UUID;Lcom/teamviewer/apidefinitions/chat/models/ReadMessageRequest;)Lo/qi0;", "removeUser", "(Ljava/util/UUID;Ljava/util/List;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/chat/models/ChatRenameConversation;", "chatRenameConversation", "Lcom/teamviewer/apidefinitions/chat/models/ChatRenameConversationResponse;", "renameConversation", "(Ljava/util/UUID;Lcom/teamviewer/apidefinitions/chat/models/ChatRenameConversation;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/chat/models/ChatSendMessage;", "chatSendMessage", "Lcom/teamviewer/apidefinitions/chat/models/ChatMessage;", "sendMessage", "(Ljava/util/UUID;Lcom/teamviewer/apidefinitions/chat/models/ChatSendMessage;)Lo/qi0;", "startUploadFile", "thumbnailDownload", "Lcom/teamviewer/apidefinitions/chat/models/UserTypingRequest;", "userTypingRequest", "userTyping", "(Ljava/util/UUID;Lcom/teamviewer/apidefinitions/chat/models/UserTypingRequest;)Lo/qi0;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ChatApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ qi0 getConversations$default(ChatApi chatApi, UUID uuid, String str, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: getConversations");
                return null;
            }
            if ((i & 1) != 0) {
                uuid = null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return chatApi.getConversations(uuid, str);
        }

        public static /* synthetic */ qi0 getMessages$default(ChatApi chatApi, UUID uuid, Integer num, UUID uuid2, String str, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: getMessages");
                return null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                uuid2 = null;
            }
            if ((i & 8) != 0) {
                str = null;
            }
            return chatApi.getMessages(uuid, num, uuid2, str);
        }

        public static /* synthetic */ qi0 getUsersBySearchParam$default(ChatApi chatApi, String str, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: getUsersBySearchParam");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return chatApi.getUsersBySearchParam(str);
        }

        public static /* synthetic */ qi0 sendMessage$default(ChatApi chatApi, UUID uuid, ChatSendMessage chatSendMessage, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: sendMessage");
                return null;
            }
            if ((i & 2) != 0) {
                chatSendMessage = null;
            }
            return chatApi.sendMessage(uuid, chatSendMessage);
        }
    }

    @yc5("modifyusers/{conversationId}")
    qi0<ChatModifyUserResponse> addUsers(@xg5("conversationId") UUID conversationId, @j80 ChatAddUsers chatAddUsers);

    @ox2("status")
    qi0<ChatStatus> chatStatus();

    @yc5("conversations")
    qi0<ChatConversation> createConversation(@j80 ChatCreateConversation chatCreateConversation);

    @jg1("conversations")
    qi0<f88> deleteConversation(@sy5("conversationId") UUID conversationId);

    @jg1("conversations/{conversationId}/messages")
    qi0<f88> deleteMessages(@xg5("conversationId") UUID conversationId);

    @ox2("conversation/{conversationId}/file/{messageId}")
    qi0<f88> fileDownload(@xg5("conversationId") UUID conversationId, @xg5("messageId") String messageId);

    @ox2("conversation/{conversationId}")
    qi0<ChatConversation> getConversation(@xg5("conversationId") UUID conversationId);

    @ox2("conversations")
    qi0<ChatConversationsResponse> getConversations(@sy5("conversationId") UUID conversationId, @sy5("lastActivityBefore") String lastActivityBefore);

    @ox2("conversations/{conversationId}/messages")
    qi0<ChatGetMessagesResponse> getMessages(@xg5("conversationId") UUID conversationId, @sy5("limit") Integer limit, @sy5("lastMessageId") UUID lastMessageId, @sy5("lastMessageTime") String lastMessageTime);

    @yc5("search/users")
    qi0<List<ChatUser>> getUsersById(@j80 List<String> requestBody);

    @ox2("search/users")
    qi0<List<ChatUser>> getUsersBySearchParam(@sy5("searchParam") String searchParam);

    @yc5("conversation/{conversationId}/messageisread")
    qi0<f88> readMessage(@xg5("conversationId") UUID conversationId, @j80 ReadMessageRequest readMessageRequest);

    @jg1("modifyusers/{conversationId}")
    qi0<ChatModifyUserResponse> removeUser(@xg5("conversationId") UUID conversationId, @j80 List<String> requestBody);

    @qc5("conversations/{conversationId}/title")
    qi0<ChatRenameConversationResponse> renameConversation(@xg5("conversationId") UUID conversationId, @j80 ChatRenameConversation chatRenameConversation);

    @yc5("conversations/{conversationId}/messages")
    qi0<ChatMessage> sendMessage(@xg5("conversationId") UUID conversationId, @j80 ChatSendMessage chatSendMessage);

    @yc5("conversation/{conversationId}/file")
    qi0<f88> startUploadFile(@xg5("conversationId") UUID conversationId);

    @ox2("conversation/{conversationId}/filethumbnail/{messageId}")
    qi0<f88> thumbnailDownload(@xg5("conversationId") UUID conversationId, @xg5("messageId") String messageId);

    @yc5("conversation/{conversationId}/typing")
    qi0<f88> userTyping(@xg5("conversationId") UUID conversationId, @j80 UserTypingRequest userTypingRequest);
}
