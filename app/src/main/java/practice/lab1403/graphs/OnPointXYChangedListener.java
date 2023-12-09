package practice.lab1403.graphs;

import java.util.List;

import practice.lab1403.graphs.model.LinkItem;
import practice.lab1403.graphs.model.NodeItem;

public interface OnPointXYChangedListener {

    void onXYChanged(NodeItem newNode, List<LinkItem> newLinks);
}