package com.chatutils.hook;

public interface GuiChatHook {
    /** Returns true only when the chat input field is actually focused (typing mode).
     *  Returns false in scroll-only / view mode (e.g. opened via Z key). */
    boolean chatutils$isTypingMode();
}