package io.scicast.streamesh.core.flow.execution;

import io.scicast.streamesh.core.flow.FlowGraph;
import io.scicast.streamesh.core.flow.FlowParameter;

public class FlowParameterRuntimeNode extends RuntimeNode {

    private FlowParameter staticNodeValue;

    public FlowParameterRuntimeNode(FlowGraph.FlowNode flowNode) {
        this.name = flowNode.getName();
        this.staticNodeValue = (FlowParameter) flowNode.getValue();
    }

    @Override
    public boolean canExecute() {
        return false;
    }

    @Override
    public void notify(RuntimeNode node) {
        update(node.getValue());
    }
}