package app.isfaaghyth.uicomponent.ui

import app.isfaaghyth.uicomponent.component.ComponentEvent

sealed class SampleInteractionEvent: ComponentEvent {
    object TestClicked : SampleInteractionEvent()
}