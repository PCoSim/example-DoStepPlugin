package CSM.Examples;

import CSM.Plugins.Interfaces.IDoStepPlugin;

public class DoStepPlugin implements IDoStepPlugin {
    @Override
    public int DoStep(int i, double v, double v1) {
        System.out.println(String.format("Performing step for FMU: %d with CCS: %f  and CCP: %f", i, v, v1));
        return 0;
    }
}
