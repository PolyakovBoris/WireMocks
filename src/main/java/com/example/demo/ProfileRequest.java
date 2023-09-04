package com.example.demo;

import org.jetbrains.annotations.NotNull;

public record ProfileRequest(@NotNull
                                 String login,
                             @NotNull
                                 String passwd) {
}
