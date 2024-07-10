package com.example.gridapp.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gridapp.model.DataSource
import com.example.gridapp.model.vo.Topic

@Composable
fun TopicsGrid(
    paddingValues: PaddingValues,
    topics: List<Topic>
) {
    Column(modifier = Modifier.padding(paddingValues)) {
        LazyVerticalGrid(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize(),
            columns = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            items(topics) { topic ->
                TopicCard(topic = topic)
            }
        }
    }
}

@Composable
@Preview
fun TopicsGridPreview() {
    TopicsGrid(
        topics = DataSource.topics,
        paddingValues = PaddingValues(0.dp)
    )
}

