package com.hieuwu.groceriesstore.presentation.onboarding

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.hieuwu.groceriesstore.presentation.onboarding.widgets.OnboardingScreenBackground
import com.hieuwu.groceriesstore.presentation.onboarding.widgets.OnboardingScreenContent

@Composable
fun OnboardingScreen(
    modifier: Modifier = Modifier,
    navigateToMainInitialScreen: () -> Unit
) {
    Scaffold { paddingValues ->
        Box(
            modifier = Modifier
                .padding(paddingValues)
                .padding(
                    WindowInsets.navigationBars.asPaddingValues()
                )
        ) {
            OnboardingScreenBackground(
                modifier = modifier.fillMaxSize(),
            )
            OnboardingScreenContent(
                modifier = Modifier.align(Alignment.BottomCenter),
                navigateToMainInitialScreen,
            )
        }
    }
}
