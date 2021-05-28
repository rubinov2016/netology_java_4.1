public class BonusMilesService {
    public int calculate(int cost) {
        int bonusRate = 20;         //для хранения количества рублей для одной бонусной милли
        int bonusMile;              //итоговое количество бонусных милль
        bonusMile = (int)(cost/bonusRate);
        return bonusMile;
    }
}
