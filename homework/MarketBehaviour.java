package homework;

import java.util.List;

interface MarketBehaviour {
    void acceptToMarket(Actor actor);

    void releaseFromMarket(List<Actor> actors);

    void update();
}
