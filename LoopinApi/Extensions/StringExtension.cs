namespace LoopinApi.Extensions
{
    public static class StringExtension
    {
        public static DateTime Ctod(this string value)
        {
            var data = value.Split("/");
            return new DateTime(
                int.Parse(data[2]),
                int.Parse(data[1]),
                int.Parse(data[0]));
        }
    }
}
