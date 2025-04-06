package IntroductionToEnums;

    public enum Tag {
        MONTAG,
        DIENSTAG,
        MITTWOCH,
        DONNERSTAG,
        FREITAG,
        SAMSTAG,
        SONNTAG;

        private Tag() {
        }

        public int getArbeitZeit() {
            switch (this.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    return 8;
                case 5:
                    return 4;
                case 6:
                    return 0;
                default:
                    return 0;
            }
        }

    }