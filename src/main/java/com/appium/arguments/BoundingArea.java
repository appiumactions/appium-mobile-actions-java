package com.appium.arguments;

import lombok.Getter;

@Getter
public record BoundingArea(int left, int top, int width, int height) { }
